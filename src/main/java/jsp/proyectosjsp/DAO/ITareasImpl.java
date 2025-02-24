/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsp.proyectosjsp.DAO;

import java.util.List;
import jsp.proyectosjsp.entities.Proyectos;
import jsp.proyectosjsp.entities.Tareas;
import jsp.proyectosjsp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ITareasImpl implements ITareas {

    @Override
    public List<Tareas> listarTareas(Proyectos proyecto) {
        List<Tareas> tareas;
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            tareas = session.createQuery("FROM Tareas WHERE id_proyecto = :Proyecto",Tareas.class)
                    .setParameter("Proyecto", proyecto).list();
        }
        return tareas;
    }

    @Override
    public void registrarTareas(Tareas tarea) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.save(tarea);
            session.getTransaction().commit();
        }
    }

    @Override
    public void eliminarTareas(Tareas tarea) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.delete(tarea);
            session.getTransaction().commit();
        }

    }

    @Override
    public Tareas buscarTareas(int id) {
        Tareas tarea;
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            tarea = (Tareas) session.createQuery("FROM Tareas WHERE id = :ID", Tareas.class)
                                       .setParameter("ID", id)
                                       .getSingleResult();
        }
        return tarea;
    }
    
}

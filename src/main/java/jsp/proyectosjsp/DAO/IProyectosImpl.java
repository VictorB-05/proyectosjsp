/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsp.proyectosjsp.DAO;

import java.util.List;
import jsp.proyectosjsp.entities.Proyectos;
import jsp.proyectosjsp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class IProyectosImpl implements IProyectos {

    @Override
    public List<Proyectos> listarProyectos(String estado) {
        List<Proyectos> proyectos;
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            proyectos = session.createQuery("FROM Proyectos WHERE estado = :estado",Proyectos.class)
                    .setParameter("estado", estado).list();
        }
        return proyectos;
    }

    @Override
    public void registrarProyectos(Proyectos proyecto) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.save(proyecto);
            session.getTransaction().commit();
        }

    }

    @Override
    public void eliminarProyectos(Proyectos proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

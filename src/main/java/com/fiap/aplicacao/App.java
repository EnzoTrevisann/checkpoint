package com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fiap.dominio.Paciente;

public class App {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                "Enzo Trevisan",
                "12.345.678-x",
                "Avenida Lino Jardim 363",
                "11991180097",
                "20/05/2004",
                "Programador",
                "enzo.trev@hotmail.com",
                null);

        Paciente paciente2 = new Paciente(
                "Thiago Martins",
                "98.765.432-x",
                "Avenida Paulista 1106",
                "11987654321",
                "05/08/2004",
                "Programador Back-End",
                "thiago.martins@hotmail.com",
                null);

        Paciente paciente3 = new Paciente(
                "Karen Fernades",
                "15.321.432-x",
                "Avenida dos estados 234",
                "11987574321",
                "25/04/2009",
                "Programador Front-End",
                "karen.fernandes@hotmail.com",
                null);

        Paciente paciente4 = new Paciente(
                "Henry Gabriel",
                "99.432.825-x",
                "Avenida Martins 33",
                "11987205399",
                "01/02/2002",
                "UI Designer",
                "henry.gabriel@hotmail.com",
                null);

        Paciente paciente5 = new Paciente(
                "Higor Miguel",
                "31.123.172-x",
                "Avenida Aclimação 99",
                "11987295121",
                "29/04/2010",
                "Programador Full-Stack",
                "Higor.miguel@hotmail.com",
                null);

        System.out.println(paciente);
        System.out.println(paciente2);
        System.out.println(paciente3);
        System.out.println(paciente4);
        System.out.println(paciente5);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa"); // instancia objetos EntityManage, gerenciando as suas entidades


        EntityManager em = emf.createEntityManager(); // efetua a operações de acesso ao banco de dados

        em.getTransaction().begin();
        em.persist(paciente);
        em.persist(paciente2);
        em.persist(paciente3);
        em.persist(paciente4);
        em.persist(paciente5);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
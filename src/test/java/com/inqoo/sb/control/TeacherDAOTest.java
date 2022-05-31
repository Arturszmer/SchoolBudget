package com.inqoo.sb.control;

import org.junit.jupiter.api.BeforeEach;

public class TeacherDAOTest {

    private TeacherDAO teacherDAO;

    @BeforeEach
    public void init() {
        teacherDAO = new TeacherDAO();
    }

    public void shouldReturnNonEmptyCollection() {
        teacherDAO.getAllTeachers(); // metoda jest widoczna, bo klasa testowa jest w tym samym pakiecie co klasa testowana
    }
}

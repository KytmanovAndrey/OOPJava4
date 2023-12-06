package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void editTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.editTeacher(firstName, secondName, patronymic, dateOfBirth);
    }

    public void getAll() {
        teacherView.sendOnConsole(teacherService.getAll());
    }
}

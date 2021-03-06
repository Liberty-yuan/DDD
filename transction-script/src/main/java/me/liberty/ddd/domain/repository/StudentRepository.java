package me.liberty.ddd.domain.repository;

import me.liberty.ddd.domain.model.Student;
import me.liberty.ddd.domain.model.StudentId;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.ddd.domain.repository, v 0.1 3/10/16
 *          Exp $
 */
public interface StudentRepository {

    void save(Student student);

    Student studentOfId(StudentId studentId);

    Student studentOfName(String name);
}

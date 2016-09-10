package com.castrodev.todo.entity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by rodrigocastro on 10/09/16.
 */
public class TaskTest {

    //    - Mudança de status
//    - Salvar vazio
//    - Criação com data
//    - Atualização de data
    Task task;

    @Before
    public void setup() {
        task = new Task("task name");
    }

    @Test
    public void status_isTodoOnCreate() throws Exception {
        assertEquals(task.getStatus(), TaskStatus.TODO);
    }

    @Test
    public void status_checkChange() throws Exception {
        assertFalse(task.isDone());
        task.setStatus(TaskStatus.DONE);
        assertTrue(task.isDone());
    }

    @Test
    public void name_validationEmpty() throws Exception {
        task.setName("");
        assertFalse(task.isValid());
    }

    @Test
    public void name_validationFilled() throws Exception {
        task.setName("asdasda");
        assertTrue(task.isValid());
    }

    @Test
    public void createdAt_isNotEmpty() throws Exception {
        task.beforeSave();
        assertTrue(task.getCreatedAt() != null);
    }

    @Test
    public void createdAt_isEmptyOnCreation() throws Exception {
        assertTrue(task.getCreatedAt() == null);
    }

}
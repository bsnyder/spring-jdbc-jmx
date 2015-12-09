package org.bsnyder.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AppTest {

    private App app;

    @Autowired
    public void setApp(App app) {
        this.app = app;
    }

    @Test
    public void testApp() throws Exception {
        Integer actual = app.select();
        assertEquals(new Integer("4"), actual);
    }
}

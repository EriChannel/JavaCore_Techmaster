package org.example;

import org.example.controller.Controller;
import org.example.service.ProductServiceImpl;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Controller controller = new Controller();
        controller.main();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Jagman
 */
public class ResultParser {

    public static void objectToXML(Class clazz, Object clazzObj, Path path) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(clazz.cast(clazzObj), path.toFile());

    }

    public static Object XMLtoObject(Class clazz, Path path) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
        return um.unmarshal(new FileReader(path.toFile().getAbsolutePath()));

    }

    public static Object XMLtoObject(Class clazz, String response) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
        StringReader reader = new StringReader(response);
        return um.unmarshal(reader);

    }

    public static <T> T jsonObjectMapper(String response, Class<T> mappedClass) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        T result = null;

        try {
            result = gson.fromJson(response, mappedClass);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}

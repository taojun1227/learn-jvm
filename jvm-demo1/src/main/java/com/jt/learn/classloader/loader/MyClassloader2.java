package com.jt.learn.classloader.loader;

import java.io.*;

/**
 * <p>Title: MyClassloader2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/29 14:57 </p>
 *
 * @author: jt-ape
 */
public class MyClassloader2 extends ClassLoader{
    public static String filePath = "/home/ziya/IdeaProjects/jvm/jvm-demo1/mytarget/classes/";

    public static String suffix = ".class";

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("MyCLassloader2 ++++++++++ :::"+name);

        /*byte[] data = getData(name);
        return defineClass(name, data, 0, data.length);*/
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = getData(name);
        return defineClass(name, data, 0, data.length);
    }

    private byte[] getData(String name) {
        InputStream in = null;
        ByteArrayOutputStream os = null;
        if (name == null) return null;
        String s = name.replace(".", "/");

        File file1 = new File("");
        String contextPath = "";
        try {
            contextPath = file1.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = contextPath.replace("\\","/")+ "/mytarget/classes/" + s+ suffix;

        File file = new File(path);
        try {
            in = new FileInputStream(file);
            os = new ByteArrayOutputStream();
            int c = 0;
            byte [] b = new byte[1024];
            while ((c = in.read(b)) !=-1) {
                os.write(b, 0, c);
            }

            return os.toByteArray();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

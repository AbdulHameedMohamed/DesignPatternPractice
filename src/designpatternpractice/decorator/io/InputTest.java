/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.decorator.io;

/**
 *
 * @author w
 */
import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                in.close();
        }
        System.out.println();
        try (InputStream in2 = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("test.txt")))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

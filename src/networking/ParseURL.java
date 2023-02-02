/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author shana
 */
public class ParseURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com:80/docs/books/tutorial"
                    + "/index.html?name=networking#DOWNLOADING");
            System.out.println("protocal = " + url.getProtocol());
            System.out.println("authority = " + url.getAuthority());
            System.out.println("host = " + url.getHost());
            System.out.println("port = " + url.getPort());
            System.out.println("path = " + url.getPath());
            System.out.println("query = " + url.getQuery());
            System.out.println("filename = " + url.getFile());
            System.out.println("ref = " + url.getRef());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

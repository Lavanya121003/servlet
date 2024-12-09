package com.xworkz.Employee.servlet;//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//
//    ServletContext cntx= req.getServletContext();
//    // Get the absolute path of the image
//    String filename = cntx.getRealPath("Images/button.png");
//    // retrieve mimeType dynamically
//    String mime = cntx.getMimeType(filename);
//    if (mime == null) {
//        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//        return;
//    }
//
//    resp.setContentType(mime);
//    File file = new File(filename);
//    resp.setContentLength((int)file.length());
//
//    FileInputStream in = new FileInputStream(file);
//    OutputStream out = resp.getOutputStream();
//
//    // Copy the contents of the file to the output stream
//    byte[] buf = new byte[1024];
//    int count = 0;
//    while ((count = in.read(buf)) >= 0) {
//        out.write(buf, 0, count);
//    }
//    out.close();
//    in.close();
//
//}


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/getImage")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Path to the image file
        String imagePath = "";

        // Read the image file
        File imageFile = new File(imagePath);
        FileInputStream fileInputStream = new FileInputStream(imageFile);
        byte[] imageData = new byte[(int) imageFile.length()];
        fileInputStream.read(imageData);
        fileInputStream.close();

        // Set the response content type to image/jpeg
        response.setContentType("image/jpeg");

        // Write the image data to the response output stream
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(imageData);
        outputStream.close();
    }
}

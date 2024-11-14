package TestOpenCv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;

public class TestOpenCv {
    public static void main(String[] args) {
        // Chargement de la bibliothèque OpenCV
        try {
        	System.load("D:\\opencv\\build\\java\\x64\\opencv_java401.dll");
        			System.out.println("Bibliothèque OpenCV chargée avec succès.");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Erreur de chargement de la bibliothèque OpenCV : " + e.getMessage());
            return;
        }
        
    }
}
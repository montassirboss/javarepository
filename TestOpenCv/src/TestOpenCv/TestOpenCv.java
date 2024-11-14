package TestOpenCv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
////////////////////////////////////////////////////////////////
public class TestOpenCv {
    public static void main(String[] args) {
        // Chargement de la bibliothèque OpenCV
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            System.out.println("Bibliothèque OpenCV chargée avec succès.");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Erreur de chargement de la bibliothèque OpenCV : " + e.getMessage());
            return;
        }

        // Chemin vers l'image
        String cheminImage = "C:\\Users\\Dell Laptop\\Downloads\\zoro.jpg"; // Simplifie le chemin si possible
        System.out.println("Chemin de l'image : " + cheminImage);

        // Chargement de l'image
        Mat image = Imgcodecs.imread(cheminImage);

        // Vérifier si l'image est bien chargée
        if (image.empty()) {
            System.out.println("Erreur : impossible de charger l'image !");
        } else {
            System.out.println("OpenCV fonctionne ! Image chargée avec succès.");
        }
    }
}


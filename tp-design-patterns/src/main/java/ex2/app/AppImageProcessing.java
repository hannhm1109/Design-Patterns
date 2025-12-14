package ex2.app;

import ex2.compression.Compressor;
import ex2.filter.FilterStrategy;
import ex2.framework.ImageFramework;

import java.util.Scanner;

/**
 * @author hanane
 **/
public class AppImageProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Classe de filtre:");
            String filterClassName = sc.nextLine().trim();
            System.out.println("Classe de compression:");
            String compressionClassName = sc.nextLine().trim();
            FilterStrategy filterStrategy = (FilterStrategy) Class.forName(filterClassName)
                    .getDeclaredConstructor()
                    .newInstance();
            Compressor compressor = (Compressor) Class.forName(compressionClassName)
                    .getDeclaredConstructor()
                    .newInstance();
            ImageFramework framework = new ImageFramework(filterStrategy, compressor);
            int[] image = {1, 2, 3, 4, 5};

            int[] filtered = framework.filter(image);
            int[] compressed = framework.compresser(filtered);
            System.out.println("Traitement terminé, taille finale = " + compressed.length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

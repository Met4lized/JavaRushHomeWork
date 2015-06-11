package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

import java.io.Reader;

/**
 * Created by ausholohov on 11.06.2015.
 */
public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes n) {
        if (n == ImageTypes.BMP) {
            return new BmpReader();
        } else if (n == ImageTypes.JPG) {
            return new JpgReader();
        } else if (n == ImageTypes.PNG) {
            return new PngReader();
        } else {
            throw  new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}

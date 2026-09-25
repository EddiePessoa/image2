package io.spring.image.demo.domain.enums;

import org.springframework.http.MediaType;

public enum ImageExtension {

    PNG(MediaType.IMAGE_PNG),
    JPG(MediaType.IMAGE_JPEG),
    JPEG(MediaType.IMAGE_JPEG);

    private final MediaType mediaType;

    ImageExtension(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public static ImageExtension fromMimeType(String mimeType) {

        if (mimeType == null) {
            throw new IllegalArgumentException("MimeType não pode ser nulo");
        }

        switch (mimeType.toLowerCase()) {
            case "image/png":
                return PNG;

            case "image/jpg":
                return JPG;

            case "image/jpeg":
                return JPEG;

            default:
                throw new IllegalArgumentException(
                        "Tipo de imagem não suportado: " + mimeType
                );
        }
    }

    public static ImageExtension ofName(String extension) {

        if (extension == null || extension.isBlank()) {
            return null;
        }

        return ImageExtension.valueOf(extension.toUpperCase());
    }
}
# 1. Aşama: Java çalışma ortamını seçiyoruz (Mac'inle uyumlu hafif bir sürüm)
FROM openjdk:21-jdk-slim

# 2. Aşama: Uygulamanın çalışacağı klasörü belirliyoruz
WORKDIR /app

# 3. Aşama: Maven ile oluşturacağımız .jar dosyasını konteyner içine kopyalıyoruz
# Not: 'target/*.jar' kısmının çalışması için önce projeyi paketlememiz gerekecek
COPY target/*.jar app.jar

# 4. Aşama: Uygulamayı başlatıyoruz
ENTRYPOINT ["java", "-jar", "app.jar"]
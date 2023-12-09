# ベースイメージをamazoncorreto17に設定
FROM amazoncorretto:17

# ワーキングディレクトリを設定
WORKDIR /root

# ビルド時にリポジトリのルートディレクトリから相対パスを使ってjarファイルをコンテナにコピーし、名前をapp.jarに変更
# Dockerfileが ${リポジトリのルートディレクトリ}/docker/backend にあるため、相対パスは ../build/libs/Kotest-0.0.1.jar となる
COPY build/libs/Kotest-0.0.1.jar app.jar

# コンテナ起動時にapp.jarを実行
ENTRYPOINT ["java", "-jar", "app.jar"]

# メモ

## 信頼性の高い情報源

* [GitHub Actionsの公式docs](https://docs.github.com/en/actions)
* [公式のGitHub Actions Marketplace](https://github.com/marketplace?type=actions)
* [Publishing Docker images](https://docs.github.com/en/actions/publishing-packages/publishing-docker-images)
* [Publishing images to GitHub Packages](https://docs.github.com/en/actions/publishing-packages/publishing-docker-images#publishing-images-to-github-packages)
* [Automatic token authentication](https://docs.github.com/en/actions/security-guides/automatic-token-authentication)
* [github context](https://docs.github.com/en/actions/learn-github-actions/contexts#github-context)

### よく使うアクション


#### リポジトリのチェックアウト

* actions/checkout@v4
#### Javaのセットアップ

* actions/setup-java@v4
  * キャッシュをいい感じにできないか？

### エラーログ

`buildx failed with: ERROR: invalid tag "ghcr.io/J-Azuma/githubActions-test/java:v1.0.0": repository name must be lowercase`

リポジトリ名は小文字制限あり(ユーザ名含めて小文字統一)


```
Error: buildx failed with: ERROR: failed to solve: failed to push ghcr.io/sample:v1.0.1: 
unexpected status from HEAD request to 
https://ghcr.io/v2/sample/blobs/sha256:4f4fb700ef54461cfa02571ae0db9a0dc1e0cdb5577484a6d75e68dc38e8acc1: 
400 Bad Request`
```

タグ名をメタデータで指定しておくと上手くいった
```
Error: buildx failed with: ERROR: failed to solve: failed to push test:v1.0.2: failed to authorize: 
failed to fetch oauth token: unexpected status from GET request to 
https://auth.docker.io/token?scope=repository%3Alibrary%2Ftest%3Apull%2Cpush&service=registry.docker.io: 401 Unauthorized
```

多分トークンの権限が良くない
### 備考

* dockerイメージをビルドするコマンド
  * `docker build -f docker/backend -t java:latest .`
    * -f : Dockerfileのパスを指定する
    * -t : イメージのタグを指定する
    * .  : ビルドコンテキストを指定する。ここではコマンド実行する現在のディレクトリを指定している
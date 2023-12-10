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


### 備考

* dockerイメージをビルドするコマンド
  * `docker build -f docker/backend -t java:latest .`
    * -f : Dockerfileのパスを指定する
    * -t : イメージのタグを指定する
    * .  : ビルドコンテキストを指定する。ここではコマンド実行する現在のディレクトリを指定している
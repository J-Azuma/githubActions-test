# メモ

## 信頼性の高い情報源

* [GitHub Actionsの公式docs](https://docs.github.com/en/actions)
* [公式のGitHub Actions Marketplace](https://github.com/marketplace?type=actions)

### よく使うアクション


#### リポジトリのチェックアウト

* actions/checkout@v4
#### Javaのセットアップ

* actions/setup-java@v4
  * キャッシュをいい感じにできないか？

### エラーログ

`buildx failed with: ERROR: invalid tag "ghcr.io/J-Azuma/githubActions-test/java:v1.0.0": repository name must be lowercase`

リポジトリ名は小文字制限あり


### 備考

* dockerイメージをビルドするコマンド
  * `docker build -f docker/backend -t java:latest .`
    * -f : Dockerfileのパスを指定する
    * -t : イメージのタグを指定する
    * .  : ビルドコンテキストを指定する。ここではコマンド実行する現在のディレクトリを指定している
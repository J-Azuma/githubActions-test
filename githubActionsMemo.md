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


#### エラー

```agsl
ERROR: failed to solve: failed to compute cache key: failed to calculate checksum of ref moby::4wtat6w7fvn87megu2i1h0bw8: failed to walk /var/lib/docker/tmp/buildkit-mount2474669729/build/libs: lstat /var/lib/docker/tmp/buildkit-mount2474669729/build/libs: no such file or directory

```
# 第8回課題
## 概要
-テーブルからレコードを全件取得するAPIとクエリ文字列を指定して検索するAPIも実装しました。

## データベース概要
- データベース名: music_database
- テーブル数: 1
- テーブル名: music

   ![スクリーンショット (46)](https://github.com/kttsu/learning_task_8/assets/150462533/76643f61-db2f-4757-a945-c233a7f8d111)


## 動作確認
1. テーブルからレコードを全件取得

   ![スクリーンショット (35)](https://github.com/kttsu/learning_task_8/assets/150462533/d0cfba49-07b2-4aea-a644-f2feb07a8c82)

2. クエリ文字列を指定してレコードを取得
  - startsWithで値 K を指定した場合

    ![スクリーンショット (36)](https://github.com/kttsu/learning_task_8/assets/150462533/eb281d19-16d5-43af-b946-fcb3723cd980)

 
  
  - endsWithで値 O を指定した場合

    ![スクリーンショット (47)](https://github.com/kttsu/learning_task_8/assets/150462533/0ffc73c7-9be0-4efc-a64c-10c47c8982bc)


  - containsで値 I を指定した場合

    ![スクリーンショット (48)](https://github.com/kttsu/learning_task_8/assets/150462533/13bc6ed1-2f78-4cbb-a61a-c5238f99e088)


3.該当しない値を入力した場合
　- containsで該当しない値 G を入力した場合 []　が返却される

![スクリーンショット (49)](https://github.com/kttsu/learning_task_8/assets/150462533/2d518bb7-512e-4cdc-ac53-7ae62a7c5e74)

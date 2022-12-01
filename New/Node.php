<?php
header("Content-Type: application/json; encoding=utf-8");

$response['response'] = array(
'item_id' => 'sale_item_1',
'title' => '300',
'photo_url' => 'http://www.gameduel.16mb.com/coin.jpg',
'price' => 5
);
echo json_encode($response);
?>

var fs = require('fs');
var file = 'sample.txt';
fs.readFile(file, 'utf8', function (err, data) {
  if (err) throw err;
  var wordsArray = splitByWords(data);
  var wordsMap = createWordMap(wordsArray);
  var finalWordsArray = sortByCount(wordsMap);
  console.log(finalWordsArray);
  console.log('The word "' + finalWordsArray[0].name + '" appears the most in the file ' +
    finalWordsArray[0].total + ' times');
});
function splitByWords (text) {
  var wordsArray = text.split(/\s+/);
  return wordsArray;
}
function createWordMap (wordsArray) {
   var wordsMap = {};
  wordsArray.forEach(function (key) {
    if (wordsMap.hasOwnProperty(key)) {
      wordsMap[key]++;
    } else {
      wordsMap[key] = 1;
    }
  });
  return wordsMap;
}
function sortByCount (wordsMap) {
	var finalWordsArray = [];
  finalWordsArray = Object.keys(wordsMap).map(function(key) {
    return {
      name: key,
      total: wordsMap[key]
    };
  });
  finalWordsArray.sort(function(a, b) {
    return b.total - a.total;
  });

  return finalWordsArray;

}
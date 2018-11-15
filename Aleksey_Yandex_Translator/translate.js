 var yandex_translator = {
      key : 'trnsl.1.1.20181113T124855Z.265a3dbb4ed09a6b.898310b6c4a33ca9d35f5d9c39561a578b93a8b3',
      api : 'https://translate.yandex.net/api/v1.5/tr.json/translate',

      translate_text : function (id, callback) {

        var text = document.getElementById(id).innerHTML;
        var url = this.api + '?';
        url += 'key=' + this.key + '&text=' + text + '&lang=ru-en';

        var ajax = new XMLHttpRequest();
        ajax.open('GET', url, true);
        ajax.onreadystatechange = function() {
          if (ajax.readyState == 4) {
            if (ajax.status == 200) {
              text = JSON.parse(ajax.responseText);
              document.getElementById(id).innerHTML = text.text[0];
            }
          }
        }
        ajax.send(null);




        //-----------
          /*
                  var text_call = new XMLHttpRequest();

        text_call.open('GET', url, false);

        text_call.send();

        if (text_call.status == 200) {
          alert(text_call.responseText);
        }

        */
        //-----------
      },


      
    }
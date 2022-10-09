//Шаг 1. Открыть среду разработки Android Studio

//Шаг 2. Создать новый проект

//Шаг 3. Последовательно вывести строчки стихотворения (в LogCat),
// используя переопределения событий жизненного цикла Activity

package com.example.praktika52

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

// добавляем константу TAG ,  которая будет определять источник конкретного сообщения
// при выводе в Logcat при создании фильтра с названием "Poema" и тегом фильтра "Poema"
private const val TAG = "Poema"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// В метод вызова активити onCreate добавим метод Log.d
        Log.d(TAG, "Мой дядя самых честных правил")

    }

    override fun onStart() {
        super.onStart()
 // Также в метод вызова активити  "onStart" добавляем метод Log.d
        Log.d(TAG, "Когда не в шутку занемог")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Он уважать себя заставил")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И лучше выдумать не мог")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Его пример другим наука")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Но боже мой, какая скука!")
    }


    }
//После выдачи первых трех строк,  надо нажать на эмуляторе кнопку Back - назад
// тогда появятся еще три строчки в логе


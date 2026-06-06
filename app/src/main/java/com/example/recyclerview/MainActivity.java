package com.example.recyclerview;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapter(createStudents()));
    }

    private List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("علی رضایی", "مهندسی کامپیوتر", "دانشجو شماره 1001"));
        students.add(new Student("مریم محمدی", "نرم افزار", "دانشجو شماره 1002"));
        students.add(new Student("حسین کریمی", "فناوری اطلاعات", "دانشجو شماره 1003"));
        students.add(new Student("زهرا احمدی", "مهندسی کامپیوتر", "دانشجو شماره 1004"));
        students.add(new Student("رضا حسینی", "نرم افزار", "دانشجو شماره 1005"));
        students.add(new Student("سارا موسوی", "فناوری اطلاعات", "دانشجو شماره 1006"));
        students.add(new Student("امیر جعفری", "مهندسی کامپیوتر", "دانشجو شماره 1007"));
        students.add(new Student("نگار صادقی", "نرم افزار", "دانشجو شماره 1008"));
        students.add(new Student("محمد نوری", "فناوری اطلاعات", "دانشجو شماره 1009"));
        students.add(new Student("فاطمه اکبری", "مهندسی کامپیوتر", "دانشجو شماره 1010"));
        return students;
    }
}

package kr.co.tjoeun.a20200318_03_listview01.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

import kr.co.tjoeun.a20200318_03_listview01.datas.Store;

public class StoreAdapters extends ArrayAdapter<Store> {
//    어댑터에서 종종 사용하는 변수 세가지 정의

    Context mcontext;//화면과 연결하는 연결고리
    List<Store> mList;//뿌려줄 목록을 담고있는 변수
    LayoutInflater inf;////xml -> 객체화 시켜주는 역할 클래스



    public StoreAdapters(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);


        //생성자가 실핼될때 세개의 변수를 체워줌
        mcontext = context;
        mList = objects;
        inf = LayoutInflater.from(mcontext);

    }
}

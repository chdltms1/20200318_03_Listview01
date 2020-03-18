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
    LayoutInflater inf;//



    public StoreAdapters(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);

        mcontext = context;
        mList = objects;
        inf = LayoutInflater.from(mcontext);

    }
}

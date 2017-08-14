package com.fxx.pao.ui.search;


import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;

import com.fxx.pao.R;
import com.fxx.pao.base.BaseActivity;
import com.fxx.pao.base.BasePresenter;

import butterknife.BindView;

/**
 * 搜索
 */
public class SearchActivity extends BaseActivity {
    public static final  int SEARCHTYPE_ARTICLE=0;
    public static final  int SEARCHTYPE_CODE=1;

    @BindView(R.id.et_keyword)
    EditText mEtKeyword;
    @BindView(R.id.iv_clear)
    ImageView mIvClear;
    @BindView(R.id.iv_search)
    ImageView mIvSearch;
    private int mSearchType;


    /**
     * 启动
     * @param context 上下文
     * @param searchType 搜索类型 0：文章 ；1 ：代码
     */
    public static void start(Context context,int searchType){
        Intent intent =new Intent(context,SearchActivity.class);
        intent.putExtra("searchType",searchType);
        context.startActivity(intent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    public BasePresenter getmPresenter() {
        return null;
    }

    @Override
    public void presenterSetView() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }


}

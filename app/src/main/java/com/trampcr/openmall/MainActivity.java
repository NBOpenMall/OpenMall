package com.trampcr.openmall;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.trampcr.openmall.moudle.category.CategoryFragment;
import com.trampcr.openmall.moudle.discover.DiscoverFragment;
import com.trampcr.openmall.moudle.home.HomeFragment;
import com.trampcr.openmall.moudle.personal.PersonalFragment;
import com.trampcr.openmall.moudle.shopcart.ShopCartFragment;

public class MainActivity extends AppCompatActivity {

    private Button mTabHomeBtn, mTabCategoryBtn, mTabDiscoverBtn, mTabShopCartBtn, mTabPersonalBtn;
    private HomeFragment mHomeFragment;
    private CategoryFragment mCategoryFragment;
    private DiscoverFragment mDiscoverFragment;
    private ShopCartFragment mShopCartFragment;
    private PersonalFragment mPersonalFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTabHomeBtn = (Button) findViewById(R.id.tab_home_btn);
        mTabCategoryBtn = (Button) findViewById(R.id.tab_category_btn);
        mTabDiscoverBtn = (Button) findViewById(R.id.tab_discover_btn);
        mTabPersonalBtn = (Button) findViewById(R.id.tab_personal_btn);
        mTabShopCartBtn = (Button) findViewById(R.id.tab_shop_cart_btn);

        defaultBtn();
    }

    private void addHomeFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mHomeFragment == null){
            mHomeFragment = new HomeFragment();
            ft.add(R.id.main_frame_layout, mHomeFragment);
        }
        hideFragment(ft);
        ft.show(mHomeFragment);
        ft.commit();
    }

    private void addCategoryFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mCategoryFragment == null){
            mCategoryFragment = new CategoryFragment();
            ft.add(R.id.main_frame_layout, mCategoryFragment);
        }
        hideFragment(ft);
        ft.show(mCategoryFragment);
        ft.commit();
    }

    private void addDiscoverFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mDiscoverFragment == null){
            mDiscoverFragment = new DiscoverFragment();
            ft.add(R.id.main_frame_layout, mDiscoverFragment);
        }
        hideFragment(ft);
        ft.show(mDiscoverFragment);
        ft.commit();
    }

    private void addShopCartFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mShopCartFragment == null){
            mShopCartFragment = new ShopCartFragment();
            ft.add(R.id.main_frame_layout, mShopCartFragment);
        }
        hideFragment(ft);
        ft.show(mShopCartFragment);
        ft.commit();
    }

    private void addPersonalFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (mPersonalFragment == null){
            mPersonalFragment = new PersonalFragment();
            ft.add(R.id.main_frame_layout, mPersonalFragment);
        }
        hideFragment(ft);
        ft.show(mPersonalFragment);
        ft.commit();
    }

    private void hideFragment(FragmentTransaction ft) {
        if (mHomeFragment != null) {
            ft.hide(mHomeFragment);
        }
        if (mCategoryFragment != null) {
            ft.hide(mCategoryFragment);
        }
        if (mDiscoverFragment != null) {
            ft.hide(mDiscoverFragment);
        }
        if (mShopCartFragment != null) {
            ft.hide(mShopCartFragment);
        }
        if (mPersonalFragment != null) {
            ft.hide(mPersonalFragment);
        }
    }

    private void defaultBtn() {
        mTabHomeBtn.setSelected(true);
        mTabCategoryBtn.setSelected(false);
        mTabDiscoverBtn.setSelected(false);
        mTabShopCartBtn.setSelected(false);
        mTabPersonalBtn.setSelected(false);
        addHomeFragment();
    }

    public void changeTab(View v) {
        switch (v.getId()) {
            case R.id.tab_home_btn:
                mTabHomeBtn.setSelected(true);
                mTabCategoryBtn.setSelected(false);
                mTabDiscoverBtn.setSelected(false);
                mTabShopCartBtn.setSelected(false);
                mTabPersonalBtn.setSelected(false);
                addHomeFragment();
                break;
            case R.id.tab_category_btn:
                mTabHomeBtn.setSelected(false);
                mTabCategoryBtn.setSelected(true);
                mTabDiscoverBtn.setSelected(false);
                mTabShopCartBtn.setSelected(false);
                mTabPersonalBtn.setSelected(false);
                addCategoryFragment();
                break;
            case R.id.tab_discover_btn:
                mTabHomeBtn.setSelected(false);
                mTabCategoryBtn.setSelected(false);
                mTabDiscoverBtn.setSelected(true);
                mTabShopCartBtn.setSelected(false);
                mTabPersonalBtn.setSelected(false);
                addDiscoverFragment();
                break;
            case R.id.tab_shop_cart_btn:
                mTabHomeBtn.setSelected(false);
                mTabCategoryBtn.setSelected(false);
                mTabDiscoverBtn.setSelected(false);
                mTabShopCartBtn.setSelected(true);
                mTabPersonalBtn.setSelected(false);
                addShopCartFragment();
                break;
            case R.id.tab_personal_btn:
                mTabHomeBtn.setSelected(false);
                mTabCategoryBtn.setSelected(false);
                mTabDiscoverBtn.setSelected(false);
                mTabShopCartBtn.setSelected(false);
                mTabPersonalBtn.setSelected(true);
                addPersonalFragment();
                break;
        }
    }
}

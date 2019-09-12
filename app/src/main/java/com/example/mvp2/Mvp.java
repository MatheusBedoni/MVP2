package com.example.mvp2;

public interface Mvp {
    interface View{
    }
    interface Model{}
    interface Presenter<V>{
        public void attachView(V view);
    }
}

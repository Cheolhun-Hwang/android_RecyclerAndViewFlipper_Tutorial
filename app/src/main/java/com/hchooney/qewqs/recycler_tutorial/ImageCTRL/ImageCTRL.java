package com.hchooney.qewqs.recycler_tutorial.ImageCTRL;

import android.content.res.Resources;
import android.widget.ImageView;

import com.hchooney.qewqs.recycler_tutorial.R;

/**
 * Created by qewqs on 2018-01-19.
 */

public class ImageCTRL {

    public static void selectImage(ImageView imageView, String target){
        switch (target){
            case "1":
                imageView.setImageResource(R.drawable.puppy);
                break;
            case "2":
                imageView.setImageResource(R.drawable.puppy2);
                break;
            case "3":
                imageView.setImageResource(R.drawable.puppy3);
                break;
            case "4":
                imageView.setImageResource(R.drawable.puppy4);
                break;
            case "5":
                imageView.setImageResource(R.drawable.puppy5);
                break;
            case "6":
                imageView.setImageResource(R.drawable.puppy6);
                break;
            default:
                imageView.setImageResource(R.drawable.noimage);
                break;
        }
    }
}

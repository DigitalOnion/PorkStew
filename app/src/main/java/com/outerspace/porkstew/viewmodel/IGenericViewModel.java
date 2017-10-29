package com.outerspace.porkstew.viewmodel;

import com.outerspace.porkstew.adapter.IGenericDataItem;

/**
 * Created by user on 10/28/17.
 */

public interface IGenericViewModel {

    public IGenericViewModel getInstance();

    public void setDataItem(IGenericDataItem dataItem);

}

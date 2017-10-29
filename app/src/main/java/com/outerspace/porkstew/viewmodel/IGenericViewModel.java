package com.outerspace.porkstew.viewmodel;

import com.outerspace.porkstew.adapter.IGenericDataItem;

/**
 * IGenericViewModel is the generic blueprint for a View Model needed in the GenericAdapter
 *
 */
public interface IGenericViewModel {

    public IGenericViewModel getInstance();

    public void setDataItem(IGenericDataItem dataItem);

}

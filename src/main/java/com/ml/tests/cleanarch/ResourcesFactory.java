package com.ml.tests.cleanarch;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.ShippingCostInteractor;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.ShippingCostResolver;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.ItemApiDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.ItemDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.UserApiDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.UserDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostController;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostInput;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostOutput;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostPresenter;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.view.ShippingCostView;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.view.ShippingCostViewModel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.view.View;

/**
 * Emulation of an Dependency Injection framework.
 * It has all the wiring of components for this example.
 */
public abstract class ResourcesFactory {

    public static GetShippingCostController buildController() {
        GetShippingCostInput input = buildInput();

        return new GetShippingCostController(input);
    }

    public static GetShippingCostInput buildInput() {
        UserDataAccess userDataAccess = buildUserDataAccess();
        ItemDataAccess itemDataAccess = buildItemDataAccess();
        ShippingCostResolver resolver = buildResolver();
        GetShippingCostOutput output = buildOutput();

        return new ShippingCostInteractor(userDataAccess, itemDataAccess, resolver, output);
    }

    public static ShippingCostResolver buildResolver() {
        return new ShippingCostResolver();
    }

    public static GetShippingCostOutput buildOutput() {
        View<ShippingCostViewModel> view = buildView();

        return new GetShippingCostPresenter(view);
    }

    public static UserDataAccess buildUserDataAccess() {
        return new UserApiDataAccess();
    }

    public static ItemDataAccess buildItemDataAccess() {
        return new ItemApiDataAccess();
    }

    public static View<ShippingCostViewModel> buildView() {
        return new ShippingCostView();
    }

}

/*
 * Copyright (c) 2019 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by arman on 22/7/2019.
 */

package com.adyen.checkout.card.data.output;

import android.support.annotation.NonNull;

import com.adyen.checkout.card.data.validator.NumberValidator;

public class CardNumberField extends BaseFiled<NumberValidator.NumberValidationResult> {

    public CardNumberField(@NonNull NumberValidator.NumberValidationResult validationResult) {
        super(validationResult);
    }
}

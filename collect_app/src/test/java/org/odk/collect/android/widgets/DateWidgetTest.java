package org.odk.collect.android.widgets;

/**
 * Created by Peter on 06/12/2016.
 */


import android.util.Log;
import android.widget.DatePicker;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.IAnswerData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.*;

import java.io.Console;

import static android.util.Log.d;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

/*
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.odk.collect.android.widgets.DateWidget;
*/

@RunWith(MockitoJUnitRunner.class)

public class DateWidgetTest {

    @Mock
    DatePicker mMockDatePicker;

    @Mock
    DateWidget mockDateWidget;

    @Test
    public void itShouldRun() {
        when(mMockDatePicker.getYear()).thenReturn(2016);
        when(mMockDatePicker.getMonth()).thenReturn(3);
        when(mMockDatePicker.getYear()).thenReturn(15);

        DateData answer = (DateData) mockDateWidget.getAnswer();
        d("test", answer.getDisplayText());
        assertEquals(false, false);
    }
}

import React from 'react';
import {cleanup, fireEvent, render} from '@testing-library/react';
import CheckboxWithLabel from './CheckboxWithLabel';


afterEach(cleanup);

it('CheckboxWithLabel changes the text after click', () => {
  const {queryByLabelText, getByLabelText} = render(
    <CheckboxWithLabel labelOn="On" labelOff="Off" />,
  );

  expect(queryByLabelText(/Off/i)).toBeTruthy();

  fireEvent.click(getByLabelText(/Off/i));

  expect(queryByLabelText(/on/i)).toBeTruthy();
});
ComboBox<String> cBox = new ComboBox<String>();
		cBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				
			}
		});
		cBox.getItems().addAll("GBK","UTF-8");
		cBox.setValue("GBK");

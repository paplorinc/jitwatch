/*
 * Copyright (c) 2013, 2014 Chris Newland.
 * Licensed under https://github.com/AdoptOpenJDK/jitwatch/blob/master/LICENSE-BSD
 * Instructions: https://github.com/AdoptOpenJDK/jitwatch/wiki
 */
package org.adoptopenjdk.jitwatch.ui;

import org.adoptopenjdk.jitwatch.model.IMetaMember;
import org.adoptopenjdk.jitwatch.ui.triview.ITriView;

import javafx.stage.Stage;

public interface IStageAccessProxy
{
	ITriView openTriView(IMetaMember member, boolean force);
	
	void openBrowser(String title, String html, String stylesheet);
	
	void openTextViewer(String title, String contents, boolean lineNumbers, boolean highlighting);

	Stage getStageForDialog();
}
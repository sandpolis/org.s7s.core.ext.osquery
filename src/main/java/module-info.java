//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
open module com.sandpolis.core.integration.osquery {
	exports com.sandpolis.core.integration.osquery;

	requires com.sandpolis.core.foundation;
	requires org.slf4j;
	requires java.net.http;
	requires com.sandpolis.core.integration.pacman;
	requires com.fasterxml.jackson.databind;
}
# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group for Qt5 qtdeclarative qml"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
  qtdeclarative-qmlplugins \
"


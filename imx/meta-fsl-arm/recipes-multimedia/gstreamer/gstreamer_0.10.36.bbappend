
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI_append = " file://0001-baseparse-Fix-self-comparison-always-evaluates-to-tr.patch"


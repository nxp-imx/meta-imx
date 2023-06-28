FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-add-support-for-RSA-public-and-private-key-operation.patch \
	    file://0001-Fix-build-for-Linux-6.3-rc1.patch \
	    file://0001-Fix-build-for-Linux-6.4.patch \
	    file://0001-cryptodev_verbosity-Fix-build-for-Linux-6.4.patch"

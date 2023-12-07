# fsl-eula2.bbclass defines a common naming scheme used by the
# packing and unpacking mechanisms defined in fsl-eula-pack.bbclass
# and fsl-eula2-unpack2.bbclass.
#
# Note that it is not necessary to inherit this class directly. It is
# already inherited from fsl-eula-pack.bbclass and fsl-eula2-unpack2.bbclass.
#
# The naming scheme can be extended through regular bitbake means to allow
# configuration-specific archives, as can be seen in fsl-eula-graphics.bbclass
# and fsl-eula2-package-arch.bbclass.
IMX_PACKAGE_NAME                 = "${BPN}-${IMX_PACKAGE_VERSION}"
IMX_PACKAGE_NAME:class-native    = "${PN}-${IMX_PACKAGE_VERSION}"
IMX_PACKAGE_NAME:class-nativesdk = "${PN}-${IMX_PACKAGE_VERSION}"

INSANE_SKIP:${PN}     += "arch"
INSANE_SKIP:${PN}-dbg += "arch"

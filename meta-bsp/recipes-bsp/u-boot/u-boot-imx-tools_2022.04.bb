require recipes-bsp/u-boot/u-boot-tools.inc
require recipes-bsp/u-boot/u-boot-imx-common_${PV}.inc

DEPENDS += "gnutls util-linux"

PROVIDES:append:class-target = " ${MLPREFIX}u-boot-tools"
PROVIDES:append:class-native = " u-boot-tools-native"
PROVIDES:append:class-nativesdk = " nativesdk-u-boot-tools"

do_compile () {
	# Yes, this is crazy. If you build on a system with git < 2.14 from scratch, the tree will
	# be marked as "dirty" and the version will include "-dirty", leading to a reproducibility problem.
	# The issue is the inode count for Licnses/README changing due to do_populate_lic hardlinking a
	# copy of the file. We avoid this by ensuring the index is updated with a "git diff" before the
	# u-boot machinery tries to determine the version.
	#
	# build$ ../git/scripts/setlocalversion ../git
	# ""
	# build$ ln ../git/
	# build$ ln ../git/README ../foo
	# build$ ../git/scripts/setlocalversion ../git
	# ""-dirty
	# (i.e. creating a hardlink dirties the index)
	cd ${S}; git diff; cd ${B}

	oe_runmake -C ${S} tools-only_defconfig O=${B}

	# Disable CONFIG_CMD_LICENSE, license.h is not used by tools and
	# generating it requires bin2header tool, which for target build
	# is built with target tools and thus cannot be executed on host.
	sed -i -e "s/CONFIG_CMD_LICENSE=.*/# CONFIG_CMD_LICENSE is not set/" ${SED_CONFIG_EFI} ${B}/.config

	oe_runmake -C ${S} cross_tools NO_SDL=1 O=${B}
}

do_install:append () {
	# mkeficapsule
	install -m 0755 tools/mkeficapsule ${D}${bindir}/uboot-mkeficapsule
	ln -sf uboot-mkeficapsule ${D}${bindir}/mkeficapsule
}

FILES:${PN} += "${bindir}/uboot-mkeficapsule ${bindir}/mkeficapsule"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE:class-target = "(imx-generic-bsp)"

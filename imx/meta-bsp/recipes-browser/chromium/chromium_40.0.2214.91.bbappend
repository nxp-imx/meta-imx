# Update the dependency on imx-vpuwrap
DEPENDS_remove_mx6q = " libfslvpuwrap"
DEPENDS_remove_mx6dl = " libfslvpuwrap"

DEPENDS_append_mx6q = " imx-vpuwrap"
DEPENDS_append_mx6dl = " imx-vpuwrap"

# Don't use X if it's running through Wayland

CHROMIUM_ENABLE_WAYLAND = "${@base_contains('DISTRO_FEATURES', 'wayland', '1', \
                      base_contains('DISTRO_FEATURES', 'x11', '0', \
                      '0', d),d)}"

# This is the workaround for the segfault when running google-chrome

PACKAGECONFIG[ignore-gpu-blacklist] = ""
PACKAGECONFIG_append = " ignore-gpu-blacklist"

CHROMIUM_EXTRA_ARGS_append = " \
	${@bb.utils.contains('PACKAGECONFIG', 'ignore-gpu-blacklist', '--ignore-gpu-blacklist', '', d)} \ 
"

# libffmpeg.so needs to be installed in bindir to run conformance test videos

do_install_append() {
	#Chromium plugins libs
	for f in libpdf.so libosmesa.so libffmpegsumo.so; do
		if [ -f "${B}/out/${CHROMIUM_BUILD_TYPE}/$f" ]; then
                        rm -rf ${D}${libdir}/${BPN}/$f
			install -Dm 0644 ${B}/out/${CHROMIUM_BUILD_TYPE}/$f ${D}${bindir}/${BPN}/$f
		fi
	done 
}

FILES_${PN}-codecs-ffmpeg_remove = "${libdir}/${BPN}/libffmpegsumo.so"
FILES_${PN}-codecs-ffmpeg_append = " ${bindir}/${BPN}/libffmpegsumo.so"
FILES_${PN}-plugin-pdf_remove = "${libdir}/${BPN}/libpdf.so"
FILES_${PN}-plugin-pdf_append = " ${bindir}/${BPN}/libpdf.so"

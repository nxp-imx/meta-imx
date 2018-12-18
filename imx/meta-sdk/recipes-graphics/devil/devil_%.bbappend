# Use source package from CAF because of frequent fetch errors.
SRC_URI_remove = "http://sourceforge.net/projects/openil/files/DevIL/${PV}/DevIL-${PV}.zip"

SRC_URI_prepend = "https://source.codeaurora.org/mirrored_source/external/imx/DevIL-${PV}.zip "

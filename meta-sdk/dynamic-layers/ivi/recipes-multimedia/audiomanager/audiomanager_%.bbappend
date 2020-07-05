FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"

SRC_URI_append = " file://0001-audiomanager-Workaround-to-pass-the-configure-error.patch"

# replace function in poky/meta/classes/insane.bbclass
python do_qa_staging() {
    bb.note("[workaround] QA checking staging")

    if not qa_check_staged(d.expand('${SYSROOT_DESTDIR}${STAGING_LIBDIR}'), d):
        bb.fatal("QA staging was broken by the package built above")
}

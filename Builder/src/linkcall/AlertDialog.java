package linkcall;


public class AlertDialog {
    private CharSequence title;
    private View customTitle;
    private CharSequence message;
    private View view;
    private int icon;
    private CharSequence positiveButton;
    private int negativeButton;

    public void setTitle(CharSequence title) {
        this.title = title;
    }

    public void setCustomTitle(View customTitle) {
        this.customTitle = customTitle;
    }

    public void setMessage(CharSequence message) {
        this.message = message;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setPositiveButton(CharSequence positiveButton) {
        this.positiveButton = positiveButton;
    }

    public void setNegativeButton(int negativeButton) {
        this.negativeButton = negativeButton;
    }

    private void show() {
        System.out.println(this);
    }

    public static class Builder {
        private AlertDialog dialog ;

        public Builder() {
            this.dialog = new AlertDialog();
        }

        public Builder setTitle(CharSequence title) {
            dialog.setTitle(title);
            return this;
        }

        public Builder setCustomTitle(View customTitleView) {
            dialog.setCustomTitle(customTitleView);
            return this;
        }


        public Builder setMessage(CharSequence message) {
            dialog.setMessage(message);
            return this;
        }

        public Builder setIcon(int iconId) {
            dialog.setIcon(iconId);
            return this;
        }


        public Builder setPositiveButton(CharSequence text) {
            dialog.setPositiveButton(text);
            return this;
        }

        public Builder setNegativeButton(int textId) {
            dialog.setNegativeButton(textId);
            return this;
        }


        public Builder setView(View view) {
            dialog.setView(view);
            return this;
        }


        public AlertDialog create() {
            return dialog;
        }

        public AlertDialog show() {
            final AlertDialog dialog = create();
            dialog.show();
            return dialog;
        }
    }




    @Override
    public String toString() {
        return "AlertDialog{" +
                "title=" + title +
                ", customTitle=" + customTitle +
                ", message=" + message +
                ", view=" + view +
                ", icon=" + icon +
                ", positiveButton=" + positiveButton +
                ", negativeButton=" + negativeButton +
                '}';
    }
}

